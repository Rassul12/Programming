public class GreedyKnapsack{
public static void greedyKnapsack(double c,double []profit,double []weight){

double []x=new double[3];
double maxprofit=0.0;
for(int i=0;i<profit.length;i++){
if(weight[i]>=c){

x[i]=(c/weight[i]);
c = c-weight[i];
maxprofit=maxprofit+(profit[i] * x[i]);
if(c<=0)break;
}
else{
x[i]=1.0;
c = c-weight[i];
maxprofit+=profit[i];
}

}
System.out.println("Profit :"+maxprofit);
for(int j=0;j<3;j++){
System.out.println(x[j]);
}
}
public static void main(String []args){
double []p={25,24,15};
double []w={18,15,10};
greedyKnapsack(20.0,p,w);
}
}