<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Grails webflow example</title>

	</head>
	<body>
	    <h1>Step One</h1>

        <g:form action='step'>
            <input type="text" name="fieldOne"/>
            <g:submitButton name="submitOne" value="Continue"/>
        </g:form>
	</body>
</html>
