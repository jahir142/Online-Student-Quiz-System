let questions = [
    {
        q: "Java is which type of language?",
        a: "Procedural",
        b: "Object Oriented",
        c: "Scripting",
        ans: "b"
    },
    {
        q: "HTML stands for?",
        a: "Hyper Text Markup Language",
        b: "High Text Machine Language",
        c: "Hyper Tool Multi Language",
        ans: "a"
    }
];

let index = 0;
let score = 0;

function loadQuestion() {
    document.getElementById("question").innerHTML = questions[index].q;
    document.getElementById("optA").innerHTML = questions[index].a;
    document.getElementById("optB").innerHTML = questions[index].b;
    document.getElementById("optC").innerHTML = questions[index].c;
}

loadQuestion();

function nextQuestion() {
    let options = document.getElementsByName("option");
    let selected = "";

    for (let opt of options) {
        if (opt.checked) {
            selected = opt.value;
            opt.checked = false;
        }
    }

    if (selected === questions[index].ans) {
        score++;
    }

    index++;

    if (index < questions.length) {
        loadQuestion();
    } else {
        localStorage.setItem("score", score);
        window.location.href = "result.html";
    }
}
