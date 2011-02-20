library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

use work.leros_types.all;

-- instruction memory
-- write is ignored for now
-- the content should be generated by an assembler

entity leros_im is
	port  (
		clk : in std_logic;
		reset : in std_logic;
		din : in im_in_type;
		dout : out im_out_type
	);
end leros_im;

architecture rtl of leros_im is

	signal areg		: std_logic_vector(IM_BITS-1 downto 0);
	signal data		: std_logic_vector(15 downto 0);

begin

process(clk) begin

	if rising_edge(clk) then
		areg <= din.rdaddr;
	end if;

end process;

	dout.data <= data;

process(areg) begin

	case areg is

		when X"00" => data <= X"0011";
		when X"01" => data <= X"1234";
		when X"02" => data <= X"abcd";
		when X"03" => data <= X"22aa";
		when X"04" => data <= X"3412";
		when X"05" => data <= X"907f";
		when others => data <= X"0000";
	end case;
end process;

end rtl;
