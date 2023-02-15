package exemple_enum;

public class Enum_exemple {

	public enum language {
		JAVA("Language Java","Eclipse"),
		C("Language C", "Code::Blocks"),
		Cplus("Language C++","Visual studio"),
		PHP("Language PHP", "Sublime text");
		
		private String name = "";
		private String editeur;
		
		 language (String name,String editeur )
		{
			this.name = name;
			this.editeur = editeur;
		}
		 
		public String getName()
		 {
			 return name;
		 }
		
		public String getediteur()
		{
			return editeur;
		}
	}
	
}
