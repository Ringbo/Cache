diff --git a/common/buildcraft/transport/FacadePluggable.java b/common/buildcraft/transport/FacadePluggable.java
index 48df87b..49734e9 100644
--- a/common/buildcraft/transport/FacadePluggable.java
+++ b/common/buildcraft/transport/FacadePluggable.java
@@ -61,7 +61,7 @@
 	}
 
 	public boolean isHollow() {
-		return states == null ? renderAsHollow : !states[0].hollow;
+		return states == null ? renderAsHollow : states[0].hollow;
 	}
 
 	public Block getRenderingBlock() { return block; }
