# App Name: University Selector

# App Logo:

![Logo](https://user-images.githubusercontent.com/46695115/68987338-87ca1480-07ee-11ea-9f3d-ddbe418f8b78.png)

# Authors:

1) Chatur Kurma
2) Samrat Adloori
3) Rajesh Tarigopula
4) Karthik Reddy Muthyala

# Contributors :

1) Chatur Kurma - Works with funtionality
2) Samrat Adloori - Works with database connectivity and backend 
3) Rajesh Tarigopula - Works with User Interface functionality
4) Karthik Reddy Muthyala - works with User Interface FrontEnd

# Project Description :
## Activities:


The project college selector system is an application where students can search and enroll for different colleges which they want. Student can search for colleges through mobiles at anytime and anyplace. This is created for the students looking for admissions in best colleges. Even colleges get more enrollments into the institute. The system provides a list of colleges to the student where they can select their required college. After selecting the preferences, the list of universities is shown which come under their preferences. Results are display instantly and system sends the results to the respective colleges which student choose for evaluation along with student details. Here Initial procedure for conducting an admission can be automated through system.


## Features and Models:

1.	Survey : After the collecting the information, a basic survey form is displayed with a set of questions to answer in a simple way.
2.	Admin Login : The Whole system will be under the control of admin and admin provides the inputs to system. Updating / Deleting the colleges list will be done by admin.
3.	Student Login : Any student can login by creating an account. Student should provide all required information needed by college while filling the form.
4.	Student Preferences : After Login in, we have a preference page, where we enter our preferred location, Food style, culture and based on these preferences universities are shown.
5.	College selection : After creating a login, each student can see a list of colleges along their details. Colleges as per their preferences are shown.
6.	Student feedback form : Student can also give their reviews about this system by filling up a feedback form in system.


## Functionality: 
We use the database to store the values entered by students.

## Persists on the app:   
Username, password, Student Preference

## Database Used: back4App
  We are using the back4App for storing the list of all universities and their location and type of university.
- Admin Login is also saved in the database for editing the list of all universities.
- We have List of Universities, their location, type of University.
- In the Sign-up page, a new user must be created by filling the signup form .
- Sign-up page has First name, Last name, Email, Contact, password.
- We will have to save all these data in database from signup page for logging in of user and then validating it.
- After a user successfully signs up, that particular user details have to be entered in users table of cloud database.
- After user logs in, they need to take a survey, and based on the preferences in the survey the list of Universities is displayed accordingly.
- After selecting the University, we need to apply for the university through Apply button which directs to the university website.
- The user needs to take the feedback for the site development of Universities.
- Feedback of the user is also stored in the database.
- When user done entering all above-mentioned information, then on clicking submit button, it must be entered into database into table University select.

## Activity Flow Diagram:

![Hosted image](https://github.com/karthikmuthyala/ANDROID_project/blob/master/hdfc.jpg)

## Layouts of our project:
- Welcome Page:
This is an Welcome page of the webiste which shows the options to select Admin Login and Student Login. The user should select one of the option to redirect for the next page.

![1](https://user-images.githubusercontent.com/46695115/68988202-49862280-07f9-11ea-90d9-fb54bd8ecd1e.PNG)

- Student Login Page:
This is the Student Login Page which the student need to enter user id and password to login. There is the forgot password option which leads the user to set new password and there is the sign-up option for the new users.

![2](https://user-images.githubusercontent.com/46695115/68985751-82fd6480-07de-11ea-9e7c-384e7121ca7a.PNG)

- Sign-up Page:
This is the sign-up page where the user need to enter the details like First Name, Last Name, Email, Contact, Password and Confirm Password to register to the website.

![3](https://user-images.githubusercontent.com/46695115/68986009-c5c03c00-07e0-11ea-98a3-e7b0b9a4a61e.PNG)

- Forgot Password Page:
This is the Forgot Password Page where user can set new password with his/her user name, set password and confirm password.

![4](https://user-images.githubusercontent.com/46695115/68986409-bd6a0000-07e4-11ea-8002-a1fd40ef3f3d.PNG)

- Survey Page:
In this page user can see some questions like Preferred location, State or Private Universities and Climate.

![9](https://user-images.githubusercontent.com/46695115/68986879-8ba76800-07e9-11ea-9762-5d5123138477.PNG)

- List Of Universities Page:
In this page User can see the list of universities as per the survey he gives.

![5](https://user-images.githubusercontent.com/46695115/68986856-5c90f680-07e9-11ea-889a-4efdd2f87b50.PNG)

- Selected University Page (Northwest Missouri State Univeristy):
In this page user can see the details of the selected university like Univeristy type, Location, Graduation Rate, Required GRE Score and IELTS score with APPLY button. And these requirements changes from univeristy to university.

![6](https://user-images.githubusercontent.com/46695115/68986520-c6a79c80-07e5-11ea-90d0-fed6759e904c.PNG)

- Redirected Page (Northwest Missouri State Univeristy):
When we click on Apply button in the selected univeristy it redirects to the univeristy website where user can apply to that particular university.

![7](https://user-images.githubusercontent.com/46695115/68986622-b5ab5b00-07e6-11ea-960f-73b2f447700b.PNG)

- Feedback Page:
There is Feedback page for the users with Feedback and comments sections.

![8](https://user-images.githubusercontent.com/46695115/68986728-d45e2180-07e7-11ea-9186-7a94b5933cbe.PNG)







