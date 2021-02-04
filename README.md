# java-springboot-microservices

Created a sample Springboot project which sends messages to AWS SQS and a consumer which takes in the contents of the Queue

1 - Create AWS SQS Queue: 
- Go to SQS on the AWS console
- Use a Standard queue and not a FIFO 
- Name your queue 'springboot-test-queue' & you will also need to take your access key and secret key and add this to your application.properties & application.yml files
- Click "Create queue" and update the URI endpoints in the same files as the last step with your new URI

2 - Testing: 
- Once your Springboot application is started you can begin testing 
- Using Postman, Insomnia or any similar tool send a post request to http://localhost:9091/produce/message
- the body will be json and something like this {"id": 1001001, "name": "Stephen", "rollNumber": "123456789"}
- Check your logs to see the message was sent to SQS and your consumer recieved the message from the queue
