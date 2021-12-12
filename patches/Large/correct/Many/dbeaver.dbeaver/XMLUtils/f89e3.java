diff --git a/modules/org.jkiss.utils/src/org/jkiss/utils/xml/XMLUtils.java b/modules/org.jkiss.utils/src/org/jkiss/utils/xml/XMLUtils.java
index e438967..1605996 100644
--- a/modules/org.jkiss.utils/src/org/jkiss/utils/xml/XMLUtils.java
+++ b/modules/org.jkiss.utils/src/org/jkiss/utils/xml/XMLUtils.java
@@ -130,7 +130,7 @@
 
 	// Get list of all child elements of specified node
 	@NotNull
-	public static Collection<Element> getChildElementList(
+	public static List<Element> getChildElementList(
         Element parent,
         String nodeName)
 	{
