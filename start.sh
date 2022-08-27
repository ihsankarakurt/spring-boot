docker run -d  --name postgres-dev -p 5432:5432 -e POSTGRES_PASSWORD=password -e POSTGRES_USER=username -e POSTGRES_DB=schema postgres:latest
