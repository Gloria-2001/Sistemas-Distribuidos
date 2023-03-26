JFLAGS = -g

JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		Main.java \
              GuiPoligono.java \
              PanelPoligono.java \
		PanelVariosPoligonos.java \
		Coordenada.java \
		OrdenaArea.java \
		PoligonoIrreg.java \
		PoligonoReg.java \

default: classes 

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class

run:
		java Main