console.log('chat.js')
// JS 클라이언트 웹소켓 # new WebSocket("ws://localhost:8080/ws매핑주소");
let clientSocket = new WebSocket("ws://localhost:8080/chat/conn");
console.log(clientSocket);

// [1] clientSocket 의 onclose , onerror , onmessage , onopen 정의 해야한다.
    // (1) WebSocket 객페내 onopen 속성은 서버소켓과 접속을 성공했을 때 발동되는 함수 정의해서 대입
clientSocket.onopen = (e) => {
    console.log("서버소켓과 연결 성공");
}
    // (2) WebSocket 객페내 onmessage 속성은 서버소켓이 메세지를 보낼왔을때 발동되는 함수 정의해서 대입
clientSocket.onmessage = (messageEvent) => {   // e : 매개변수
    console.log(messageEvent);
    console.log(messageEvent.data); // 받은 내용물이 들어있는 속성
    // 1. 받은 메세지 출력할 HTML 호출
    let msgBox = document.querySelector(".msgBox")
    // 2. 받은 메세지를 HTML에 대입
    msgBox.innerHTML += `<div> ${messageEvent.data} </div>`
}

// [2] 메세지 전송이벤트
function onMsgSend(){
    console.log('onMsgSend() called')
    // - 현재 클라이언트 소켓과 연결 유지괸 서버소켓에게 메세지 전송
    let msgInput = document.querySelector(".msgInput");
    clientSocket.send(msgInput.value);
    msgInput.value = ""
}