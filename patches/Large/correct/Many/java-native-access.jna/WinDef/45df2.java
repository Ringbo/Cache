diff --git a/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java b/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java
index ec2cbb3..bc92a5d 100644
--- a/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java
+++ b/contrib/platform/src/com/sun/jna/platform/win32/WinDef.java
@@ -70,11 +70,11 @@
 		}
 
 		public void setValue(WORD value) {
-			getPointer().setInt(0, value.intValue());
+			getPointer().setShort(0, value.shortValue());
 		}
 
 		public WORD getValue() {
-			return new WORD(getPointer().getInt(0));
+			return new WORD(getPointer().getShort(0));
 		}
 	}
 
