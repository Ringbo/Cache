diff --git a/src/org/nutz/lang/Mirror.java b/src/org/nutz/lang/Mirror.java
index 3dca585..76f7da6 100644
--- a/src/org/nutz/lang/Mirror.java
+++ b/src/org/nutz/lang/Mirror.java
@@ -1366,7 +1366,7 @@
 	 * @return true or false
 	 */
 	public boolean isPojo() {
-		if (this.klass.isPrimitive())
+		if (this.klass.isPrimitive() || this.isEnum())
 			return false;
 
 		if (this.isStringLike() || this.isDateTimeLike())
