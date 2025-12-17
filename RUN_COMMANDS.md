# Commands to Run the Application

## Option 1: Using Maven (Command Line)

### Build the project:
```bash
mvn clean install
```

### Run the application:
```bash
mvn spring-boot:run
```

### Or build and run in one step:
```bash
mvn clean spring-boot:run
```

---

## Option 2: Using IDE (Recommended for Development)

### IntelliJ IDEA / Eclipse:
1. Open the project in your IDE
2. Right-click on `FundamentalsFirstApiApplication.java`
3. Select "Run" or "Debug"

### VS Code:
1. Install "Extension Pack for Java"
2. Open the project
3. Click "Run" button on `FundamentalsFirstApiApplication.java`

---

## Option 3: Build JAR and Run

### Build executable JAR:
```bash
mvn clean package
```

### Run the JAR:
```bash
java -jar target/fundamentals-first-api-0.0.1-SNAPSHOT.jar
```

---

## Test the API

Once the application is running (on port 8080), test with:

### Create Order (POST):
```bash
curl -X POST http://localhost:8080/api/orders ^
  -H "Content-Type: application/json" ^
  -d "{\"customerId\":\"C101\",\"amount\":199.99}"
```

### Get Order (GET - Valid):
```bash
curl http://localhost:8080/api/orders/123
```

### Get Order (GET - 404 Test):
```bash
curl http://localhost:8080/api/orders/404
```

---

## PowerShell Alternative (if curl not available):

### Create Order:
```powershell
Invoke-RestMethod -Uri http://localhost:8080/api/orders -Method POST -ContentType "application/json" -Body '{"customerId":"C101","amount":199.99}'
```

### Get Order:
```powershell
Invoke-RestMethod -Uri http://localhost:8080/api/orders/123 -Method GET
```

