db-deployment.yaml for postgres deployment in kubernates
Deployment.yaml for product-service app in kubernates
Server.yaml for product-service app in kubernates

1.	Start minikube server
minikube start –driver=docker
2.	Check minikube server status
minikube status
3.	Find the cluster status
kubectl cluster-info

4.	Get the Nodes
kubectl get nodes

5.	Set docker environment to minikube 
minikube docker-env

6.	Set token to minikube
@FOR /f "tokens=*" %i IN ('minikube -p minikube docker-env --shell cmd') DO @%i
7.	Create docker image
Docker build -t <imagename>:<tag> .

8.	Get all docker images
Docker images
9.	Create deployments for kubectl 
Kubectl create deployment <deployment_name> --image=<image_name> --port=<port>

10.	Get all deployments in kubernates
Kubectl get deployment

11.	Find the description of deployment
Kubectl descripe  deployment <deployment_name>


12.	Check the status of pods
Kubectl get pods

13.	Create service for application
Kubectl expose deployment <deployment_name> --type=<service_type>

14.	Find the url for service
Minikube service <service_name> --url



kubectl exec -it postgres-deployment-d4674c9c8-ldlnt -- psql -U postgres
