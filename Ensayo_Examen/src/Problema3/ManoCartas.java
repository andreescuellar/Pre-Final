package Problema3;
/**
*
* @author Andrés Cuéllar
*/
public class ManoCartas {
	LinkedPositionalList<Poker> l = new LinkedPositionalList<Poker>();
	/**
	 * @param Valor del numero de la carta, tipo de carta
	 */
	public void AddCard(int valor, String categoria) {
		Poker d = new Poker();
		d.setValorCarta(valor);
		d.setTipoCarta(categoria);
		if(l.isEmpty()) {
			l.addFirst(d);
		}else {
			LinkedPositionalList<Poker> Lprueba = new LinkedPositionalList<Poker>();
			Lprueba = l;
			while(Lprueba.isEmpty() != true) {
				Poker a = new Poker();
				a = (Poker) Lprueba.first();
				if(a.getValorCarta() == valor) {
					if(a.getTipoCarta() == categoria) {
						System.out.println("Carta ya implementada");
					}else {
						l.addFirst(d);
					}
				}else {
					l.addFirst(d);
				}
				Position<Poker> p = l.first();
				Lprueba.remove(p);
			}
		}
	}
	/**
	 * @param Tipo de carta
	 */
	public void Play(String categoria) {
		boolean UsedCard = false;
		LinkedPositionalList<Poker> L = new LinkedPositionalList<Poker>();
		L = l;
		while(L.isEmpty() != true) {
			Poker a = new Poker();
			a = (Poker) L.first();
			if(a.getTipoCarta() == categoria) {
				Position<Poker> p = L.first();
				L.remove(p);
				UsedCard = true;
				break;
			} 
		}
		if(UsedCard == false) {
			Position<Poker> p = L.last();
			L.remove(p);
			UsedCard = true;
		}
	}
}