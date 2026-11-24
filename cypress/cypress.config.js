const { defineConfig } = require('cypress')
module.exports = defineConfig({
  e2e: { baseUrl: 'https://quickpizza.grafana.com', defaultCommandTimeout: 10000 },
  video: true,
  screenshotOnRunFailure: true
})
