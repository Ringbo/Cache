diff --git a/javamelody-core/src/main/java/net/bull/javamelody/HtmlJavaInformationsReport.java b/javamelody-core/src/main/java/net/bull/javamelody/HtmlJavaInformationsReport.java
index 2d6e80f..3145bc8 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/HtmlJavaInformationsReport.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/HtmlJavaInformationsReport.java
@@ -219,7 +219,7 @@
 				writeln("<img src='?resource=servers/" + applicationServerIconName
 						+ "' alt='#Serveur#'/>");
 			}
-			writeln(serverInfo + columnEnd);
+			writeDirectly(serverInfo + columnEnd);
 			writeln("<tr><td>#Contexte_webapp#: </td><td>" + javaInformations.getContextPath()
 					+ columnEnd);
 		}
