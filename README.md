<h1>Demo Blaze</h1>


<h2>Automated testcase for Demo Blaze</h2>

<h3>Overview</h3>
Automated test case using Selenium.<br>
Test opens the website, order 2 laptops then removes one of them.<br>
Rest of the flow currently incomplete<br>

<h3>Requirements</h3>
Java 18 and Maven installed.<br>
All other dependencies are included in the maven installation and will be done automatically.


<h3>Commands</h3>
Build run `mvn clean compile`<br>

Tests run `mvn clean verify`<br>

Report run `mvn clean install test surefire-report:report`<br>

Report generated in Target->surefire-reports.<br>