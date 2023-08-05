function alwaysHungry(arr) {
    foundfood= false;
    for(var i=0; i<=arr.length ; i++){
        if(arr[i]==='food'){
            console.log('yummy')
            foundfood=true;
        }
    }
    if(!foundfood){
        console.log('Im hungry')
    }


}
   
alwaysHungry([3.14, "food", "pie", true, "food"]);
// this should console log "yummy", "yummy"
alwaysHungry([4, 1, 5, 7, 2]);
// this should console log "I'm hungry"

function highPass(arr, cutoff) {
    var filteredArr = [];
    for(var i=0; i<arr.length; i++){
        if(arr[i]>5){
            filteredArr.push(arr[i]);
        }
    }
    return filteredArr;
}
var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log(result); 

function betterThanAverage(arr) {
    var sum = 0;
    for(var i=0; i<arr.length; i++){
        sum=sum+arr[i];
    }
    var count = 0
     for(var i=0; i<arr.length; i++){
        if(arr[i]>sum/arr.length){
            count++ ;
        }
     }
    return count;
}

function reverse(arr) {
     var newArr=[];
    for(var i=arr.length-1; i>=0 ; i--){
        newArr.push(arr[i])
    }
    return newArr;
}
   
var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back ["e", "d", "c", "b", "a"]

function fibonacciArray(n) {
    var fibArr = [0, 1];
    for (var i = 2; i <= n; i++) {
        var prev1 = fibArr[i - 1];
        var prev2 = fibArr[i - 2];
        fibArr.push(prev1 + prev2);
      }
}
   
var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
