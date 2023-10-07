function reverseWordsInSentence(sentence) {
    let words = sentence.split(" ");

    
    let reversedWords = [];

    for (let word of words) {
        let ans = reverseWord(word);
        reversedWords.push(ans);
    }

    
    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

// Function to reverse a single word
function reverseWord(word) {
    return word.split("").reverse().join("");
}
let input = prompt("Enter a sentence: ");
let Result = reverseWordsInSentence(input);

console.log("Reversed sentence: " + Result);