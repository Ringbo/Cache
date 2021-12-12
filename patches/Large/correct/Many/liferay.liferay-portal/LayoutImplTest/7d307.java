diff --git a/portal-impl/test/integration/com/liferay/portal/model/impl/LayoutImplTest.java b/portal-impl/test/integration/com/liferay/portal/model/impl/LayoutImplTest.java
index 2adc65f..d710f59 100644
--- a/portal-impl/test/integration/com/liferay/portal/model/impl/LayoutImplTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/model/impl/LayoutImplTest.java
@@ -184,7 +184,7 @@
 
 			_layout.setType(type);
 
-			Assert.assertFalse(_layout.isTypePanel());
+			Assert.assertFalse(_layout.isTypePortlet());
 		}
 	}
 
