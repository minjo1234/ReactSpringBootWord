// React Router를 사용하여 라우팅 설정 (App.js)
import React, { useEffect, useState } from 'react';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import axios from 'axios';
import AnotherPage from './Component/Another'; // 다른 페이지 컴포넌트 가져오기
import Header from "./Component/Header";
import DayList from "./Component/DayList";
import Day from "./Component/Day";
import CreateWord from "./Component/CreateWord";
import CreateDay from "./Component/CreateDay";
import another from "./Component/Another";
import Another from "./Component/Another";
import SaveAPI from "./Component/SaveAPI";
function App() {
    const [hello, setHello] = useState('');

    useEffect(() => {
        // Spring Boot 애플리케이션의 REST API 엔드포인트로 GET 요청 보내기
        axios.get('/api/hello')
            .then(response => setHello(response.data))
            .catch(error => console.log(error));
    }, []);

    return (
        <BrowserRouter>
            <div className="App">
            <Header/>
                <Routes>
                    <Route exact path="/anoter" element={<Another />} />
                    <Route exact path="/" element={<DayList />} />
                    <Route exact path="/day/:day" element={<Day />} />
                    <Route exact path="/create_word" element={<CreateWord />} />
                    <Route exact path="/create_day" element={<CreateDay />} />
                </Routes>
                <SaveAPI/>
            </div>

        </BrowserRouter>
    );
}

export default App;
