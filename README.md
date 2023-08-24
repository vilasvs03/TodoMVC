# TodoMVC
Test Assignment of REST API

This is a simple spring boot service, which exposes REST API for fetching merchant details.
Here I used inMemoryRepository for CRUD operations which is implemented using h2 DB.
Initial data is provided in data.sql file located in /resources.

Exposed API uses postmapping and outputs details of AllMerchants and MerchantById in the same API depending upon the request payload.
