import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function SaveAPI() {
    const [data, setData] = useState({
        // 여기에 저장할 데이터를 정의
        days: [],
        words: [],
    });

    useEffect(() => {
        // API에서 데이터 가져오기
        axios.get('http://localhost:3020/days')
            .then(response => {
                setData(prevData => ({
                    ...prevData,
                    days: response.data,
                }));
            })
            .catch(error => {
                console.error('Error fetching days:', error);
            });

        axios.get('http://localhost:3020/words')
            .then(response => {
                setData(prevData => ({
                    ...prevData,
                    words: response.data,
                }));
            })
            .catch(error => {
                console.error('Error fetching words:', error);
            });
    }, []);

    const saveDataToAPI = () => {
        // data 객체에 저장된 데이터를 API로 보내는 코드 (이 부분은 이전 코드 그대로 사용 가능)
        axios
            .post('/api/days', data.days) // 일자 데이터를 서버에 전송
            .then((response) => {
                console.log(response.data);
                // 일자 데이터 저장에 성공하면 다음 작업 수행
                axios
                    .post('/api/words', data.words) // 단어 데이터를 서버에 전송
                    .then((response) => {
                        console.log(response.data);
                        // 단어 데이터 저장에 성공하면 다음 작업 수행
                        // 저장이 완료되면 리다이렉션 또는 다른 작업 수행
                    })
                    .catch((error) => {
                        console.error('Error saving words:', error);
                    });
            })
            .catch((error) => {
                console.error('Error saving days:', error);
            });
    };

    return (
        <div>
            <h2>Save Data to API</h2>
            <button onClick={saveDataToAPI}>Save Data</button>
        </div>
    );
}
