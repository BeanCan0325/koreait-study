import Child from "../components/06_Child.jsx"; //STUDY: 자식 컴포넌트

export default function Props() { //STUDY:부모 컴포넌트(함수 조각낸거라고 생각하면됨)

    /*STUDY:
            ▶▶[Props] : 컴포넌트끼리 데이터를 전달하기 위한 방식
                        부모에서 던져주는 이름과 자식에서 받는 이름이 동일해야 함.
    */

    return(
        <>
            <Child img={{src:'https://i.imgur.com/R6Pwu27.jpeg',alt:'고양이'}}
                   //img ->객체{} 를 전달한 것
                    size={500}/>
                    //size는 값(200)을 전달
        </>
    )
};