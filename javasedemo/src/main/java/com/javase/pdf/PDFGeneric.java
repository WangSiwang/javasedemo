package com.javase.pdf;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

//com.itextpdf.text.Document：这是iText库中最常用的类，它代表了一个pdf实例。如果你需要从零开始生成一个PDF文件，你需要使用这个Document类。首先创建（new）该实例，然后打开（open）它，并添加（add）内容，最后关闭（close）该实例，即可生成一个pdf文件。
//
//com.itextpdf.text.Paragraph：表示一个缩进的文本段落，在段落中，你可以设置对齐方式，缩进，段落前后间隔等。
//
//com.itextpdf.text.Chapter：表示PDF的一个章节，他通过一个Paragraph类型的标题和整形章数创建。
//
//com.itextpdf.text.Font：这个类包含了所有规范好的字体，包括family of font，大小，样式和颜色，所有这些字体都被声明为静态常量。
//
//com.itextpdf.text.List：表示一个列表；
//
//com.itextpdf.text.pdf.PDFPTable：表示一个表格；
//
//com.itextpdf.text.Anchor：表示一个锚，类似于HTML页面的链接。
//
//com.itextpdf.text.pdf.PdfWriter：当这个PdfWriter被添加到PdfDocument后，所有添加到Document的内容将会写入到与文件或网络关联的输出流中。
//
//com.itextpdf.text.pdf.PdfReader：用于读取PDF文件；
/**
 * 
 * @author 3
 *
 */
public class PDFGeneric {
	public static void main(String[] args) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("E:/1.pdf"));
			document.open();
			document.add(new Paragraph("hello word"));
			document.close();
			System.out.println();
		} catch (Exception e) {
			System.out.println("file create exception");
		}
	}
}
