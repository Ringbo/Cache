diff --git a/test/web/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutDecoratorMapperTests.java b/test/web/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutDecoratorMapperTests.java
index 5f402bf..1c3ab9c 100644
--- a/test/web/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutDecoratorMapperTests.java
+++ b/test/web/org/codehaus/groovy/grails/web/sitemesh/GrailsLayoutDecoratorMapperTests.java
@@ -25,7 +25,7 @@
 		Page page = parser.parse( new StringReader(html) ); 
 		Decorator d = m.getDecorator(request, page);
 		
-		assertEquals("/WEB-INF/grails-app/views/layouts/test.gsp", d.getPage());
+		assertEquals("/WEB-INF/grails-app/views/layouts/test.gsp", d.getURIPath());
 		assertEquals("test", d.getName());
 		
 	}
