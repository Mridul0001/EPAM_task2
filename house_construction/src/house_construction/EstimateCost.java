package house_construction;

public class EstimateCost {
	//Calculating estimated cost
	public int cost(char material_type, int area, char isAutomated) {
		if(material_type=='s' && isAutomated=='n') {
			return area*1200;
		}else if(material_type=='a' && isAutomated=='n') {
			return area*1500;
		}else if(material_type=='h' && isAutomated=='n') {
			return area*1800;
		}else if(material_type=='h' && isAutomated=='y') {
			return area*2500;
		}else {
			/*this condition has been put here because automated home can 
			 * only be constructed with high standard material. If input 
			 * is automated but not high standard material than return 0
			 */
		return 0;
		}
	}
}
