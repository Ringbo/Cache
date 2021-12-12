diff --git a/src/be/ibridge/kettle/core/Row.java b/src/be/ibridge/kettle/core/Row.java
index 4eddd6b..988dd97 100644
--- a/src/be/ibridge/kettle/core/Row.java
+++ b/src/be/ibridge/kettle/core/Row.java
@@ -658,7 +658,7 @@
 	 *
 	 * @return an exact copy of this row
 	 */
-	public Row Clone()  // Clone the row!
+	public synchronized Row Clone()  // Clone the row!
 	{
 		return new Row(this);
 	}
