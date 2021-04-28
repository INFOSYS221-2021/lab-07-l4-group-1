# Lab-07
Jack McGrath

Olivia Joe West

Amos Lou

# Exercise One
```
public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();
      
      String word = "redorangeyellowgreen";

      System.out.println(word + " to uppercase is " + ex01.stringToUppercase(word));
      System.out.println("The length of " + word + " is " + ex01.wordLength(word));
      System.out.println("The index of yellow in " + word + " is " + ex01.stringIndexOf("yellow", word));
      System.out.println("The word combo is " + ex01.wordCombo(word));
      System.out.println("The number of \'e\' in " + word + " is " + ex01.freqOfLetterInString('e', word));
      
    }
    
    // Complete this method to return the word in all uppercase
    private String stringToUppercase(String word) {
        return word.toUpperCase();
    }
    
    // Complete this method to return the length of the word
    private int wordLength(String word) {
        return word.length();
    }
    
    // Complete this method to return the index of 
    // the specified substring in the given word
    private int stringIndexOf(String subStr, String word) {
        int index = word.indexOf(subStr);
        return index;
    }
    
    // Complete this method to return a combination of 
    // the first three letters and the last four letters of the given word.
    // E.g. given the word "redorangeyellowgreen", "redgreen" should be returned
    private String wordCombo(String word) {
        String first3 = word.substring(0, 3);
        String last4 = word.substring(word.length() - 5, word.length());
        word = first3 + last4;
        return word;
    }
    
    // Complete this method to return the frequencey of 
    // the specified letter in the given word. If the specified letter is not 
    // in the given word, then return -1.
    // E.g. given the word "redorangeyellowgreen",
    // the frequency of 'e' in the word is 5
    private int freqOfLetterInString(char letter, String word) {
        int freq = 0;
        
        // go throuch each character in word
        // if the character is the same as the given letter,
        // then add 1 to freq
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                freq += 1;
            }
        }
        if (freq == 0) {
            freq = -1;
        }    
        return freq;
    }}
```


# Exercise Two
```
import datetime

# print the current date and time
datetime_object = datetime.datetime.now()
print("Current date and time: ", datetime_object)

# modify the following print statements using datetime_object appropriately
print("Current year: ", datetime_object.year)
print("Current month: ", datetime_object.month)
print("Current day: ", datetime_object.day)
print("Current time: ", datetime_object.time())

# modify the following statement that creates another datetime_object.
# the second datetime_object contains information about yesterday
datetime_object2 = datetime_object
today = datetime.date.today()
yesterday = today - datetime.timedelta(days=1)
datetime_object2 = yesterday

# print yesterday's date and time
print("Yesterday's date and time: ", datetime_object2, datetime_object.time())

# modify the following statement to print the current date and time in
# dd-mm-YY H:M:S format
datetime_object3 = datetime_object
print("Current date and time: ", datetime_object.day, "-", datetime_object.month,"-",datetime_object.year,datetime_object.time())
```
# Excercise Three
```
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
```
