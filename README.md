# CS-320
Software Test Automation &amp; QA

Cody Gregory CS-320-T6629 Software Test Automation & QA 22EW6

How can I ensure that my code, program, or software is functional and secure?

Ensuring ones code meets requirements and is functionally and technically sound is the primary goal of writing pretty much any code. Accomplishing this goal is a culmination of all the skills a developer has. Good practices, organized code, and a wide degree of testing are good places to start.

How do I interpret user needs and incorporate them into a program?

Requirement determination is a whole can of worms in and of itself. Assuming the human element is removed for the sake of discussion, I feel that incorporating requirements isn't really an issue, as they should be the basis of your program. If you make a program that doesn't incorporate the user's needs then you haven't really made anything. Unit testing is a great way to verify that your code does in fact meet the specifications you set out to meet.

How do I approach designing software?

I like to start with the basics and slowly iterate my way to completion. For instance in the case of the contact service, I started by creating a contact. The very first thing I knew I needed was a constructor for the contact object, then I went down the list and thought of every component a contact needs, such as the ID, the name etc. From here I would start to flesh out those variables, create getters and setters. Once I had the object in a good state I created tests to verify that the object was within specification i.e. the ID could be no longer than 10 characters. The same principle applied to the Contact Service class as well, culiminating in a complete contact service with tests to verify requirement adherence and functionality. 
