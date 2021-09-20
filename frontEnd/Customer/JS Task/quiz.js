
var questions = [
    ["What is JavaScript?", "object-oriented Programming Language", "object-based Programming Language", "Procedural Programming ","None", "2"],
    [" Apart from <b> tag, what other tag makes text bold ? ", "<fat>", "<big>", " <emp>", "<strong>>","4"],
    ["Which tag will you add to specify a font for your whole page? ", "<defaultfont>", "<font>", "<basefont>", "<targetfont>","3"],
    ["In HTML, tags that include both on and off tag are called ", "comment", " document", "container", "all","3"],
    ["If we want define style for an unique element, then which css selector will we use ?  ", "id", " text", " class", "name","11"],
      ];
  
  
  var quiz=document.getElementById("quiz");
  var ques= document.getElementById("question");
  var opt1=document.getElementById("option1");
  var opt2=document.getElementById("option2");
  var opt3=document.getElementById("option3");
  var opt4=document.getElementById("option4");
  var res=document.getElementById("result");
  var nextbutton= document.getElementById("next");
  var q=document.getElementById('quit');
  
  var tques = questions.length;
  var score = 0;
  var quesIndex = 0;
  
  function quit(){
         quiz.style.display = 'none';
         result.style.display = ' ';
         var f= score/tques;
         result.textContent = "Score = "+f;
        q.style.display ="none";
  }
  
  function give_ques(quesindex) 
  {
      ques.textContent=quesindex+1+". "+questions[quesindex][0];
      opt1.textContent=questions[quesindex][1];
      opt2.textContent=questions[quesindex][2];
      opt3.textContent=questions[quesindex][3];
      opt4.textContent=questions[quesindex][4];
       return;// body...
  };
  give_ques(0);  
  
  function nextques(){
  var selected_ans = document.getElementById('input[type=radio]:checked')
  
  if(!selected_ans)
  {
    alert("SELECT AN OPTION");return;
  }
  
  if(selected_ans.value == questions[quesIndex[5]]){
    score += 1;
  }
  selected_ans.checked = false;
  quesindex++;
  
  if(quesindex == tques-1)
   nextbutton.textContent= "Finish";
  
    var f= score/tquestion;
    if(quesindex==tques)
           {
           q.style.display='none';
            quiz.style.display='none';
            result.style.display='';
            result.textContent="SCORED:"+(f*100).toFixed(2)+"%";
              return;
           }
          give_ques(quesindex);
  
  }
  
  