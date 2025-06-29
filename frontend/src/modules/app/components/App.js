import React from "react";
import { HashRouter as Router, Routes, Route, Link } from "react-router-dom";
import Login from "./Login"; // Import the new Login component
const Body = () => {
  return (
    <div>
      {/* ...existing homepage content... */}
      <nav style={{ textAlign: "right", margin: "16px" }}>
        <Link to="/login">Login</Link>
      </nav>
      {/* ...rest of your homepage... */}
    </div>
  );
};


const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/*" element={<Body />} />
      </Routes>
    </Router>
  );
};

export default App; 