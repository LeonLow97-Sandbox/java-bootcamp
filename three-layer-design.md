# 3 Layer Design

- Presentation: Controller
  - receives requests from the user and talks to the service layer
- Business: Service
  - Business logic
  - layer between presentation and data access
- Repository: Data Access
  - Sends back data to the presentation layer and it populates data back to the user.