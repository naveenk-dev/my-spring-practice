### ✅ `d9-spring-di-xml/README.md`

```markdown
# 🚗 Spring Dependency Injection (XML-based) — d9-spring-di-xml

This is a simple Java project demonstrating **Spring Framework's Dependency Injection** using classic **XML-based configuration**.

The example uses a **Vehicle/Engine** scenario to show how Spring can manage object creation and wiring, promoting **loose coupling** and **Inversion of Control (IoC)**.

---

## 🛠️ Technologies Used

- Java 8+
- Spring Framework (Core)
- XML-based Configuration
- Maven
- Spring Tool Suite (STS) / Eclipse

---

## 📂 Project Structure

```
d9-spring-di-xml/
├── src/
│   └── main/
│       ├── java/
│       │   ├── com.example.vehicle/
│       │   │   ├── Vehicle.java
│       │   │   ├── Car.java
│       │   │   └── Engine.java
│       └── resources/
│           └── applicationContext.xml
├── pom.xml
└── README.md
```

---

## 🧠 Concepts Demonstrated

- Spring IoC Container
- XML-based Bean Configuration
- Constructor Injection
- Interface-based Design
- Decoupling components using DI

---

## ▶️ How to Run

1. **Clone the main repo** (if you haven't already):
   ```bash
   git clone https://github.com/your-username/my-spring-practice.git
   cd my-spring-practice/d9-spring-di-xml
   ```

2. **Import into STS** as a Maven project.

3. **Run the main method** in `Car.java` or a separate `Main.java` class (if created).

---

## 🔧 Sample XML Config

```xml
<!-- applicationContext.xml -->
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
         http://www.springframework.org/schema/beans
         http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="engine" class="com.example.vehicle.Engine"/>
    <bean id="car" class="com.example.vehicle.Car">
        <constructor-arg ref="engine"/>
    </bean>

</beans>
```

---

## 🖨️ Sample Output

```bash
PetrolEngine: Constructor called.
Car: Constructor called.
Car: Engine dependency injected successfully using PetrolEngine.
PetrolEngine: Engine started.
Car: Started successfully with PetrolEngine.
```

---

## 📁 Related Projects

> View all Spring projects in the [main repository](../)

---

## 👨‍💻 Author

**Naveen**  
[GitHub Profile](https://github.com/naveenk-dev)

---

### ⭐ Give it a star if you found it helpful!