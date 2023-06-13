/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(str1, str2) {
    if(str1.length !=str2.length) return false;
    var freq = new Array(26).fill(0);
    for(let i = 0;i<str1.length;i++){
      freq[str1.charCodeAt(i)-97]++;
      //console.log(freq);
      freq[str2.charCodeAt(i)-97]--;
    }
    for(let i = 0;i<26;i++){
        if(freq[i]!=0) return false;
    }
    return true;

};