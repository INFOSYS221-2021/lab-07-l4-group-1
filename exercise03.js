// Example object and print statements

let person = {
   firstName: "Snow",
   lastName: "White",
   isFiction: true,
   age: 18,
   address: {
      streetAddress: "7 Fairytale Lane",
      city: "Fairytale Forest"
   },
   phoneNumbers:[
      {
         type: "home",
         number: "01 123-4567"
      },
      {
         type: "office",
         number: "01 555-4567"
      },
      {
         type: "mobile",
         number: "028 456-7890"
      }
   ],
   spouse: null
} 

// print different properties of your objects
console.log("First name of person: " + person.firstName);
for (i in person.phoneNumbers) {
    console.log("Phone number: " + person.phoneNumbers[i].number);
}



// Create your JavaScript objects

let person = {
   firstName: "Snow",
   lastName: "White",
   isEnrolled: true,
   studentId: 123456789,
   studentUsername: "abcd123",
   studyDetails: {
      courses: infosys221, busan200, econ201,
      major(s): Information Systems,
      degree(s): Bachelor of Buisiness,
   },
   Courses:[
      {
         courseTitle:    ,
         courseCategory:   ,
         categoryNum:    ,
         CourseDescription: ,
         whenOffered: , 
         courseAssignments: {
            assignmentName: ,
            assignmentGrade: , 
          },
      },
      {
         courseTitle:    ,
         courseCategory:   ,
         categoryNum:    ,
         CourseDescription: ,
         whenOffered: , 
      },
      {
         courseTitle:    ,
         courseCategory:   ,
         categoryNum:    ,
         CourseDescription: ,
         whenOffered: , 
      }
   ],
} 

// print different properties of your objects
console.log("First name of student: " + person.firstName);
for (i in person.course) {
    console.log("Courses: " + person.course[i].number);
}
