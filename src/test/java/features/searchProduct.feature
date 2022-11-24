Feature: Search and place order for products

Scenario: Search Experience for product in both home and offers page
Given User is on GreenCart Landing page
When User searched with shortname "TOM" and extracted actual name of Product
Then User Searched for same Shortname "TOM" in offers page to check if Product exist