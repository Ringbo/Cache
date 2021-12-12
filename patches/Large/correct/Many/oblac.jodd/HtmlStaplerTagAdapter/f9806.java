diff --git a/mod/jodd-wot/src/jodd/lagarto/adapter/htmlstapler/HtmlStaplerTagAdapter.java b/mod/jodd-wot/src/jodd/lagarto/adapter/htmlstapler/HtmlStaplerTagAdapter.java
index af12d73..664b903 100644
--- a/mod/jodd-wot/src/jodd/lagarto/adapter/htmlstapler/HtmlStaplerTagAdapter.java
+++ b/mod/jodd-wot/src/jodd/lagarto/adapter/htmlstapler/HtmlStaplerTagAdapter.java
@@ -58,7 +58,7 @@
 			if (tag.getName().equalsIgnoreCase("link")) {
 				String type = tag.getAttributeValue("type", false);
 
-				if (type.equalsIgnoreCase("text/css") == true) {
+				if (type == null || type.equalsIgnoreCase("text/css") == true) {
 					String media = tag.getAttributeValue("media", false);
 
 					if (media == null || media.contains("screen")) {
