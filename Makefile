# Nama file Makefile

# Direktori sumber dan output
SRC_DIR = src
BIN_DIR = bin

# Nama file utama
MAIN_CLASS = IQPuzzleSolver

# Compiler dan opsi
JAVAC = javac
JAVA = java
JFLAGS = -d $(BIN_DIR)

# Target default untuk kompilasi dan eksekusi
all: compile run

# Rule untuk kompilasi
compile:
	@mkdir -p $(BIN_DIR)  # Membuat folder bin jika belum ada (Linux/macOS)
	$(JAVAC) $(JFLAGS) $(SRC_DIR)/$(MAIN_CLASS).java

# Rule untuk menjalankan program
run:
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

# Rule untuk membersihkan file hasil kompilasi
clean:
	rm -rf $(BIN_DIR)/*.class
