In this exercise the goal is to create the repository layer for every business object.
The focus of this exercise is to understand repositories and connect our application to our database.
After this exercise the three layers should work in harmony and we should be able to permanently persist data.
Note that this exercise is a bit unique, as we don't necessarily have to write any logic in the repository files, since spring boot
can generate SQL queries for us.
As usual, in this project there are three examples with already built repositories and adjusted logic: Role, authority and user.

Short description of the exercise:
1. Create the the repository files for all business objects
2. Delete the static data sources
3. Adjust the logic in the service layer to now access the database

Additional exercises:
1. Consider logic which could be needed outside of CRUD (for example getting all bids for an auction, sorted by value)
2. Implement the endpoint, service logic and potentially a unique repository query