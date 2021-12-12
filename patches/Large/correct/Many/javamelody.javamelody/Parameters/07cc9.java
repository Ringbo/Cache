diff --git a/javamelody-core/src/main/java/net/bull/javamelody/Parameters.java b/javamelody-core/src/main/java/net/bull/javamelody/Parameters.java
index 79290ed..ece3593 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/Parameters.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/Parameters.java
@@ -142,7 +142,7 @@
 			for (final URL url : urls) {
 				final String urlString = url.toString();
 				// on enlève le suffixe ajouté précédemment dans parseUrl
-				sb.append(urlString.substring(0, urlString.indexOf("/monitoring"))).append(',');
+				sb.append(urlString.substring(0, urlString.lastIndexOf("/monitoring"))).append(',');
 			}
 			sb.delete(sb.length() - 1, sb.length());
 			properties.put(entry.getKey(), sb.toString());
