diff --git a/java/org/apache/tomcat/util/security/Escape.java b/java/org/apache/tomcat/util/security/Escape.java
index b8ae5bc..4f12983 100644
--- a/java/org/apache/tomcat/util/security/Escape.java
+++ b/java/org/apache/tomcat/util/security/Escape.java
@@ -52,25 +52,25 @@
             } else if (c == '>') {
                 sb.append("&gt;");
             } else if (c == '\'') {
-                sb.append("&#x27;");
+                sb.append("&#39;");
             } else if (c == '&') {
                 sb.append("&amp;");
             } else if (c == '"') {
                 sb.append("&quot;");
             } else if (c == '/') {
-                sb.append("&#x2F;");
+                sb.append("&#47;");
             } else {
                 sb.append(c);
             }
         }
 
-        return sb.toString();
+        return (sb.length() > content.length()) ? sb.toString() : content;
     }
 
 
     /**
      * Convert the object to a string via {@link Object#toString()} and HTML
-     * escape the resulting string for use in HTMl content.
+     * escape the resulting string for use in HTML content.
      *
      * @param obj       The object to convert to String and then escape
      *
@@ -83,7 +83,7 @@
         }
 
         try {
-            return xml(obj.toString());
+            return htmlElementContent(obj.toString());
         } catch (Exception e) {
             return null;
         }
@@ -109,8 +109,8 @@
      * @param ifNull    The value to return if content is {@code null}
      * @param content   The content to escape
      *
-     * @return  The escaped content or the value of ifNull if the content was
-     *          {@code null}
+     * @return  The escaped content or the value of {@code ifNull} if the
+     *          content was {@code null}
      */
     public static String xml(String ifNull, String content) {
         return xml(ifNull, false, content);
@@ -155,6 +155,6 @@
             }
         }
 
-        return sb.toString();
+        return (sb.length() > content.length()) ? sb.toString(): content;
     }
 }
