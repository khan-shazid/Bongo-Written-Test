//code initiates by calling the main()
//comment the main() method and uncomment the executeTestCases() method for testing

compareStrings = (str1,str2) => { //just basic comparison between strings, returns true or false
    if(str1==str2){
        return 1;
    }else{
        return 0;
    }
}

sortString = (str) => { //returns an sorted string in ascending order
  let arr = str.split('');
  let tmp;
  for(let i = 0; i < arr.length; i++){
    for(let j = i + 1; j < arr.length; j++){
      //if ASCII code greater then swap the elements position
      if(arr[i] > arr[j]){
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
      }
    }
  }
  return arr.join('');
}

main = () => { //takes input in a endless while loop as long as prompt is not cancelled.
    let string1 = null;
    let string2 = null;
    let check = null;

    while(1){
        string1 = prompt("Please enter your name", "<String1 goes here>");
        if(string1===null || string1===""){
            break;
        }
        string2 = prompt("Please enter your name", "<String2 goes here>");
        if(string2===null || string2===""){
            break;
        }
        check = compareStrings(sortString(string1),sortString(string2));

        if(check){
            alert("Anagram");
        }else{
            alert("Not Anagram")
        }
    }
}

executeTestCases = () => {
    let testData = [
            {
                str1:'abcsd',
                str2:'abcsd1',
                result:0
            },
            {
                str1:'abbet',
                str2:'tbaet',
                result:0
            },
            {
                str1:'Astro',
                str2:'astro',
                result:0
            },
            {
                str1:'Astro',
                str2:'Astro',
                result:1
            }
        ];
    let flag = null;
    let result = "";
    testData.forEach((item,index) => {
        if(compareStrings(item.str1,item.str2)==item.result){
            result+="Test succeeded for \""+item.str1+"\" && \""+item.str2+"\", should return "+(item.result == 0 ? "false" : "true")+"\n";
        }else{
          result+="Test failed for \""+item.str1+"\" && \""+item.str2+"\" \n";
        }
    })
    alert(result);
}


main();

//executeTestCases();
