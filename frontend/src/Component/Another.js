// 다른 페이지 컴포넌트 (예: AnotherPage.js)
import React from 'react';
import {Link} from "react-router-dom";
function AnotherPage() {
    return (
        <div>
            <ul>

                <li>
                    <Link to="/another">다른 페이지로 이동</Link>
                </li>
            </ul>
        </div>
    );
}

export default AnotherPage;
