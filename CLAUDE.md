# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Steganabara is a Java-based steganalysis tool for detecting hidden data in images. It provides visual analysis tools to examine RGB bit layers, color histograms, and pixel-level data to uncover steganographic content.

## Build and Run Commands

### Compilation
```bash
javac -d bin -sourcepath src src/steganabara/*.java src/steganabara/*/*.java
```

### Running the Application
```bash
java -classpath bin steganabara.Steganabara
```

### Generate Documentation
```bash
ant -f javadoc.xml
```

## Architecture

### Main Components

- **Steganabara.java**: Main application class extending JFrame, entry point that initializes GUI and menus
- **Stevironment.java**: Singleton environment manager handling global state and color explorer integration
- **ImagePanel.java**: Core image display component implementing ImageContainer interface

### Package Structure

- `steganabara.color/`: Color analysis tools including Color Explorer dialog, Color Table for detailed histogram view
- `steganabara.filter/`: Image filtering algorithms including Bit Mask Filter (for analyzing RGB bit layers) and Color Map Filter
- `steganabara.histogram/`: Histogram analysis and visualization components
- `steganabara.image/`: Image handling, file I/O, and display components
- `steganabara.menus/`: Menu system via MenuMaker factory class

### Key Analysis Features

- **Bit Mask Filter**: Analyzes individual bit layers of ARGB values to detect hidden data
- **Color Map Filter**: Detects similar colors that may hide steganographic content
- **Color Explorer**: Pixel-level RGB value inspection with mouse tracking
- **Histogram Analysis**: Statistical analysis to detect data hiding artifacts
- **Color Table**: Detailed color frequency analysis with navigation to Color Map

### Development Notes

- Uses Swing for GUI with custom ImagePanel for image display
- Drag-and-drop image loading via ImageFileTransferHandler
- Mouse tracking for real-time pixel analysis
- Singleton pattern for global state management (Stevironment)
- Factory pattern for menu creation (MenuMaker)