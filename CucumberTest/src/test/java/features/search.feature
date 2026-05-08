Feature: Search

Scenario Outline: Search article

Given the user is in the Product page
When the user enters '<article>' in the search bar
And the user clicks the search button
Then the product page appears

Examples:
| article |
| tshirt |
| dresses |
| jeans |
