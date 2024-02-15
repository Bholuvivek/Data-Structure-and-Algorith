function ArrayRotation( arr ) { 

    let startIndex = arr[0];

    let array_rotation = [];

    for( let i=startIndex; i<arr.length; i++ ) {
            array_rotation.push( arr[i] );
    }

    for( let i=0; i<startIndex; i++ ) {
            array_rotation.push( arr[i] );
    }

    return array_rotation.join(""); 
  
}
     
// KEEP THIS FUNCTION CALL HERE
console.log( ArrayRotation( readline() ) );

/*
    SOLUTION 2: DOES NOT USE ADDITIONAL ARRAY
*/

function ArrayRotation( arr ) { 

    let startIndex = arr[0];
    
    for( let i=0; i<startIndex; i++ ) {
            arr.push( arr[i] );
    }

    arr = arr.splice(startIndex);

    return arr.join("");
  
}

// KEEP THIS FUNCTION CALL HERE
console.log( ArrayRotation( readline() ) );