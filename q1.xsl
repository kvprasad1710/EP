<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
  <h2>Addresses</h2>
  <table border="1">
    <tr bgcolor="#9acd32">
      <th>Name</th>
      <th>city</th>
    </tr>
    <xsl:for-each select="addressbook/emp">
    <tr>
      <td><xsl:value-of select="name"/></td>
      <td><xsl:value-of select="city"/></td>
    </tr>
    </xsl:for-each>
  </table>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>