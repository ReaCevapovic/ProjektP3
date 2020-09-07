package ffos.p3.serijeapk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


//Za zakomentiratu Filter metodu treba vratiti "implements Filterable"
public class SerijeAdapter extends RecyclerView.Adapter<SerijeAdapter.Red>  {

    private List<Serije> podaci;
    private List<Serije> podacinovi;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public SerijeAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        podacinovi = new ArrayList<>(podaci);
        View view = mInflater.inflate(R.layout.izgled_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        Serije s = podaci.get(position);
        red.nazivSerije.setText(s.getNazivSerije());
        red.zanr.setText(s.getZanr());
        red.redatelj.setText(s.getRedatelj());
        red.jezik.setText(s.getJezik());
        red.anotacija.setText(s.getAnotacija());


    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }


    // Pohranjuje i reciklira pogled kako se prolazi kroz listu
    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView nazivSerije;
        private TextView zanr;
        private TextView redatelj;
        private TextView jezik;
        private TextView anotacija;

        Red(View itemView) {
            super(itemView);
           nazivSerije = itemView.findViewById(R.id.nazivSerije);
           zanr = itemView.findViewById(R.id.zanr);
           redatelj = itemView.findViewById(R.id.redatelj);
           jezik = itemView.findViewById(R.id.jezik);
           anotacija = itemView.findViewById(R.id.anotacija);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


    public Serije getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Serije> itemList) {
        this.podaci = itemList;
    }


    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


};



