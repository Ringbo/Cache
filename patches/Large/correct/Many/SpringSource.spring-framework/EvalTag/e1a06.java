diff --git a/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/tags/EvalTag.java b/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/tags/EvalTag.java
index 760ecf6..4424428 100644
--- a/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/tags/EvalTag.java
+++ b/org.springframework.web.servlet/src/main/java/org/springframework/web/servlet/tags/EvalTag.java
@@ -120,7 +120,7 @@
 		context.addPropertyAccessor(new JspPropertyAccessor(this.pageContext));
 		ConversionService conversionService = getConversionService();
 		if (conversionService != null) {
-			context.setTypeConverter(new StandardTypeConverter());
+			context.setTypeConverter(new StandardTypeConverter(conversionService));
 		}
 		return context;
 	}
