# 

## Model
www.msaez.io/#/102642193/storming/bc4bdec9b33c8b1a04447ae600a8c2b777

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- servicecontext
- funeralcontext
- usercontext
- memorialcontext
- llm


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- servicecontext
```
 http :8088/conversionServices serviceId="serviceId"serviceName="serviceName"imageUrl="imageURL"detailedUrl="detailedURL"
 http :8088/recommendMessages messageId="messageId"comment="comment"serviceId1="serviceId1"serviceId2="serviceId2"customerId="customerId"createMessageDate="createMessageDate"
```
- funeralcontext
```
 http :8088/funeralInfos id="id"nameHangeul="nameHangeul"nameHanja="nameHanja"rrn="rrn"gender="gender"religion="religion"relationToHouseholdHead="relationToHouseholdHead"reportRegistrationDate="reportRegistrationDate"reportUserId="reportUserId"reporterName="reporterName"reporterRrn="reporterRrn"reporterRelationToDeceased="reporterRelationToDeceased"reporterAddress="reporterAddress"reporterPhone="reporterPhone"reporterEmail="reporterEmail"submitterName="submitterName"submitterRrn="submitterRrn"funeralCompanyName="funeralCompanyName"directorName="directorName"directorPhone="directorPhone"funeralHomeName="funeralHomeName"mortuaryInfo="mortuaryInfo"funeralHomeAddress="funeralHomeAddress"funeralDuration="funeralDuration"processionDateTime="processionDateTime"burialSiteInfo="burialSiteInfo"templateKeyword="templateKeyword"
 http :8088/documentFiles documentid="documentid"
```
- usercontext
```
 http :8088/users id="id"loginId="loginId"loginPassword="loginPassword"name="name"role="role"
 http :8088/customerProfiles customerId="customerId"userId="userId"phone="phone"age="age"job="job"address="address"gender="gender"hasChildren="hasChildren"isMarried="isMarried"
```
- memorialcontext
```
 http :8088/memorials memorialId="memorialId"customerId="customerId"imageUrl="imageUrl"name="name"age="age"birthOfDate="birthOfDate"deceasedDate="deceasedDate"gender="gender"
 http :8088/videos videoId="videoId"memorialId="memorialId"videoPath="videoPath"videoTitle="videoTitle"createdAt="createdAt"keyword="keyword"
 http :8088/photos photoId="photoId"memorialId="memorialId"title="title"path="path"uploadedAt="uploadedAt"
 http :8088/comments commentId="commentId"memorialId="memorialId"userId="userId"content="content"createdAt="createdAt"
 http :8088/familyMembers familyMemberId="familyMemberId"memorialId="memorialId"userId="userId"name="name"relationship="relationship"
 http :8088/tributes tributeId="tributeId"memorialId="memorialId"content="content"keywords="keywords"createdAt="createdAt"
```
- llm
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```
