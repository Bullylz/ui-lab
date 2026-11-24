describe('Selenium web form', () => {
  it('submits the form and receives confirmation', () => {
    cy.visit('https://www.selenium.dev/selenium/web/web-form.html')
    cy.get('#my-text-id').type('Phumat UI Lab')
    cy.get('button[type="submit"]').click()
    cy.get('#message').should('have.text', 'Received!')
  })
})
