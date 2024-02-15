function SearchingChallenge(str) {    
    const count = parseInt(str.slice(0,1), 10);    
    const subjectString = str.slice(1);    
    const len = subjectString.length;
    let maxCount = 0;    
    for (let i = 0; i < len; i++) {        
         var counter = 0;        
        let holder = [];        
        let charArray = [];        
        for (let j = i; j < len; j++) {            
            let char = subjectString.charAt(j);            
            if (charArray.some(val => val === char)) {                
                holder.push(char);                
                counter++;                
                if (j === len - 1) {                    
                    if (counter > maxCount) {                        
                        result = Array.from (holder);                    
                    } maxCount = Math.max(counter, maxCount);                
                } continue;            
            } else {                
                if (charArray.length < count) {                    
                    counter++;                    
                    charArray.push(char);                    
                    holder.push(char)                    
                    continue;                
                } else {                    
                    if (counter > maxCount) {                        
                        result = Array.from(holder);                    
                    }                    
                    maxCount = Math.max(counter, maxCount);                    
                    break;                
                }            
            }        
        }    
    }    
    return result.join('');
}
   
// keep this function call here 
console.log(SearchingChallenge(readline()));