Cypress.Commands.add('adminLogin', (user, password) => {
  cy.visit('/admin')
  cy.get('#svelte-announcer').should('exist')
  cy.get('#username').clear().type(user)
  cy.get('#password').clear().type(password)
  cy.get('button[type="submit"]').click()
})
